package spring.spring_study.repository;

import spring.spring_study.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findByID(Long id);
    Optional<Member> findByName(Long name);
    List<Member> fundAll();

}
