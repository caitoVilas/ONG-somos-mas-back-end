package ong.somosmas.appsomosmas.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public final class NewUser {

    @NotNull
    @NotBlank
    private String name;
    @Email
    @NotNull
    private String email;
    @NotNull
    @NotBlank
    private String password;
    @NotNull
    @NotBlank
    private String roles;
}
