package umc.spring.study.domain;

import java.util.List;
import java.util.ArrayList;

import lombok.*;
import java.time.LocalDate;
import javax.persistence.*;

import umc.spring.study.domain.common.BaseEntity;
import umc.spring.study.domain.enums.*;
import umc.spring.study.domain.mapping.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberImage extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
