package mbti.demo.mybatis;

import mbti.demo.domain.Community;

import java.util.List;

public interface CommunityMapper {
    void save(Community community);
    List<Community> findAll();
}
