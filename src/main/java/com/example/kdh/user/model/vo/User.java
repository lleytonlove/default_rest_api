package com.example.kdh.user.model.vo;

import com.example.kdh.util.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@EntityListeners(AuditingEntityListener.class)
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="seq_id")
    private Long seqId;

    @Column(length = 100)
    @NotBlank(message = "사용자명은 공백일 수 없습니다.")
    private String name;

    @Column(length = 100)
    @NotBlank(message = "사용자 이메일은 공백일 수 없습니다.")
    @Email(message = "사용자 이메일이 이메일 형식이 아닙니다.")
    private String email;

}
