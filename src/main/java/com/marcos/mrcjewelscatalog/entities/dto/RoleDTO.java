package com.marcos.mrcjewelscatalog.entities.dto;

import com.marcos.mrcjewelscatalog.entities.Role;
import com.marcos.mrcjewelscatalog.entities.enums.RoleEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class RoleDTO {

    private Long id;
    private RoleEnum authority;

    public RoleDTO(Role role) {
        this.id = role.getId();
        this.authority = role.getAuthority();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleDTO roleDTO = (RoleDTO) o;
        return Objects.equals(id, roleDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}