package mbti.demo.service;

import lombok.RequiredArgsConstructor;
import mbti.demo.domain.Community;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommunityService implements CommunityServi {
    private final CommunityServi communityServi;

    @Override
    public Community save(Community community){
        return communityServi.save(community);
    }

    @Override
    public List<Community> findAll(){
        return communityServi.findAll();
    }

}
