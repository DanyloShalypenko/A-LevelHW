import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    void create(T entity);

    Optional<T> getById(Long id);

    Optional<T> update(T entity);

    void deleteById(Long id);

    List<T> getAll();
}
