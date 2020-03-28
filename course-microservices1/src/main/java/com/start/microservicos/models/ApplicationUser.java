package com.start.microservicos.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Entity
public class ApplicationUser implements AbstractEntty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @NotNull(message = "this fields is mandatory")
    @Column(nullable = false)
    private String username;
    @NotNull
    @Column(nullable = false)
    @NotNull(message = "this fields is mandatory")
    @ToString.Exclude
    private String password;
    @NotNull
    @Column(nullable = false)
    private String role = "USER";

    public ApplicationUser(@NotNull ApplicationUser user) {
        this.id = user.id;
        this.username = user.username;
        this.password = user.password;
        this.role = user.role;
    }
}
