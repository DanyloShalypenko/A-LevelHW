import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "account")
@Table(schema = "user_accounts", name = "operations")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "amount")
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "operation_type", columnDefinition = "text")
    private TypeOperation type;

    @Column(name = "category")
    private String category;

    @Column(name = "transactionTime")
    private LocalDateTime transactionTime;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    // Getter for 'id'
    public long getId() {
        return id;
    }

    // Setter for 'id'
    public void setId(long id) {
        this.id = id;
    }

    // Getter for 'amount'
    public BigDecimal getAmount() {
        return amount;
    }

    // Setter for 'amount'
    public void setAmount(BigDecimal amount) throws NegativeValueException {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new NegativeValueException("The amount cannot be negative or equals zero.");
        }
        this.amount = amount;
    }

    // Getter for 'type'
    public TypeOperation getType() {
        return type;
    }

    // Setter for 'type'
    public void setType(TypeOperation type) {
        this.type = type;
    }

    // Getter for 'category'
    public String getCategory() {
        return category;
    }

    // Setter for 'category'
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter for 'transactionTime'
    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    // Setter for 'transactionTime'
    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    // Getter for 'account'
    public Account getAccount() {
        return account;
    }

    // Setter for 'account'
    public void setAccount(Account account) {
        this.account = account;
    }
}