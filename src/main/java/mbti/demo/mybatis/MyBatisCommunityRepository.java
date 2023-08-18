package mbti.demo.mybatis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.Community;
import mbti.demo.service.CommunityServi;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MyBatisCommunityRepository implements CommunityServi {
    private final CommunityMapper communityMapper;

    @Override
    public Community save(Community community){
        communityMapper.save(community);
        return community;
    }

    @Override
    public List<Community> findAll(){
        return communityMapper.findAll();
    }

}
