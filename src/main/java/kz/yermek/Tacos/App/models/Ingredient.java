package kz.yermek.Tacos.App.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
public class Ingredient {
    @Id
    private String id;
    private String name;
    private Type type;
}
