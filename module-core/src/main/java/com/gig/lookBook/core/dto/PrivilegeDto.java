package com.gig.lookBook.core.dto;

import com.gig.lookBook.core.model.Privilege;
import lombok.Getter;
import lombok.Setter;

/**
 * @author prographer
 * @date: 10/30/19
 */
@Getter
@Setter
public class PrivilegeDto {
    private String privilege;
    private String description;

    public PrivilegeDto(Privilege p) {
        this.privilege = p.getPrivilege();
        this.description = p.getDescription();
    }
}
