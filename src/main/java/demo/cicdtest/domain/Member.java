package demo.cicdtest.domain;

import lombok.Data;

@Data
public class Member {

    private Long id;

    private String name;
    private String password;
}
