package cataloGO.com.catalogoBackEnd.entities;

import lombok.Getter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;



@Getter
public class Category implements Serializable {

    @Serial
   private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
