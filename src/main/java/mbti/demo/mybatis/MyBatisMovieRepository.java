package mbti.demo.mybatis;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mbti.demo.domain.BoxMovie;
import mbti.demo.domain.Movie;
import mbti.demo.repository.MovieRepository;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Slf4j
public class MyBatisMovieRepository implements MovieRepository {
    private final MovieMapper movieMapper;


    @Override
    public Optional<Movie> findByGenre(String genre) {

        return movieMapper.findByGenre(genre);
    }

    // 일반적
//    @Override
//    public List<Movie> findByAnalystType() {
//        return movieMapper.findByAnalystType();
//    }
//
//    @Override
//    public List<Movie> findByDiplomaticType() {
//        return movieMapper.findByDiplomaticType();
//    }
//
//    @Override
//    public List<Movie> findByExplorerType() {
//        return movieMapper.findByExplorerType();
//    }
//
//    @Override
//    public List<Movie> findByAdministratorType() {
//        return movieMapper.findByAdministratorType();
//    }
//
//    @Override
//    public List<Movie> findAll() {
//        return movieMapper.findAll();
//    }

    // 페이징용
    @Override
    public List<Movie> findByAnalystType(int offset, int limit) {
        RowBounds rowBounds = new RowBounds(offset, limit);
        return movieMapper.findByAnalystType(rowBounds);
    }

    @Override
    public List<Movie> findByDiplomaticType(int offset, int limit) {
        RowBounds rowBounds = new RowBounds(offset, limit);
        return movieMapper.findByDiplomaticType(rowBounds);
    }

    @Override
    public List<Movie> findByExplorerType(int offset, int limit) {
        RowBounds rowBounds = new RowBounds(offset, limit);
        return movieMapper.findByExplorerType(rowBounds);
    }

    @Override
    public List<Movie> findByAdministratorType(int offset, int limit) {
        RowBounds rowBounds = new RowBounds(offset, limit);
        return movieMapper.findByAdministratorType(rowBounds);
    }

    @Override
    public List<Movie> findMoviesWithPaging(int offset, int limit) {
        RowBounds rowBounds = new RowBounds(offset, limit);
        return movieMapper.findMoviesWithPaging(rowBounds);
    }

    // 박스오피스
    @Override
    public List<BoxMovie> findByDailyBox(int offset, int limit) {
        RowBounds rowBounds = new RowBounds(offset, limit);
        return movieMapper.findByDailyBox(rowBounds);
    }

    @Override
    public List<BoxMovie> findBoxMoviesWithPaging(int offset, int limit) {
        RowBounds rowBounds = new RowBounds(offset, limit);
        return movieMapper.findBoxMoviesWithPaging(rowBounds);
    }

    @Override
    public long countTotalBoxMovies() {
        return movieMapper.countTotalBoxMovies();
    }


    @Override
    public long countTotalMovies() {
        return movieMapper.countTotalMovies();
    }

}
