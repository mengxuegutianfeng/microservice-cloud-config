package entity;

import lombok.Data;

/**
 * @author Mathartsys
 */
@Data
public class Course {
    private Long cid;
    private String cname;
    private Long userId;
    private String cstatus;
}
