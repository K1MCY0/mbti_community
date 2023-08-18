package mbti.demo.service;

import mbti.demo.domain.Community;

import java.util.List;

public interface CommunityServi {
    Community save(Community community);
    List<Community> findAll();
}
