package ong.somosmas.appsomosmas.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ong.somosmas.appsomosmas.model.entity.Role;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserResponse {

    private Long id;
    private String name;
    private String email;
    private List<Role> roles;
    private String created;
    private String updated;
    private String imageURL;
    private String imageID;
}
