package br.com.posts.endpoint.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TB_FILE")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FILE_ID")
    private Long id;

    @Column(name = "FILE_NAME")
    private String name;

    @Column(name = "FILE_DATA")
    private String data;

}
