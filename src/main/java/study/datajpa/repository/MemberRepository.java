package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Member;

// spring data jpa 끝.
public interface MemberRepository extends JpaRepository<Member, Long> {
}
