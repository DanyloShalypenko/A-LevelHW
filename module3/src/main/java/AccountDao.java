import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.Optional;

public class AccountDao implements Dao<Account> {
    private final static AccountDao INSTANCE = new AccountDao();

    public AccountDao() {
    }

    public static AccountDao getInstance() {
        return INSTANCE;
    }

    @Override
    public void create(Account account) {
        try (Session session = ConnectorManager.openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.merge(account);
            transaction.commit();
        }
    }

    @Override
    public Optional<Account> getById(Long id) {
        try (Session session = ConnectorManager.openSession()) {
            Account account = session.find(Account.class, id);
            if (account == null) {
                System.out.println("The account with  ID " + id + " does not exist.");
            }
            return Optional.ofNullable(account);
        }
    }

    @Override
    public Optional<Account> update(Account account) {
        try (Session session = ConnectorManager.openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            Account updateAccount = session.get(Account.class, account.getId());
            Long userId = account.getUser().getId();
            session.get(User.class, userId);
            if (updateAccount != null) {
                updateAccount.setAccountName(account.getAccountName());
                updateAccount.setUser(account.getUser());
                session.merge(updateAccount);
                transaction.commit();
                return Optional.of(updateAccount);
            }
            System.out.println("The account with this ID does not exist. ");
            return Optional.empty();
        }
    }

    @Override
    public void deleteById(Long id) {
        try (Session session = ConnectorManager.openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            Account account = session.find(Account.class, id);
            if (account != null) {
                System.out.println("Account's details before deletion: ");
                System.out.println(account);
                session.remove(account);
                System.out.println("Account with id " + id + " was deleted.");
            } else {
                System.out.println("Account with id " + id + " does not exist.");
            }
            transaction.commit();
        }
    }

    @Override
    public List<Account> getAll() {
        try (Session session = ConnectorManager.openSession()) {
            return session.createQuery("SELECT account FROM Account account  account.user", Account.class).list();
        }
    }
}
