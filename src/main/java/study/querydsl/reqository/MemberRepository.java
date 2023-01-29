package study.querydsl.reqository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // select m from Member m where m.username = ?
    List<Member> findByUsername(String username);
}