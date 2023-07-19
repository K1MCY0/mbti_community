package mbti.demo.repository;
import mbti.demo.domain.Book;

import java.util.List;

public interface BookInterface {

    Book save(Book book);
    List<Book> findAll();
    List<Book> findByAnalystType(); //분석가형
    List<Book> findByDiplomaticType(); //외교관형
    List<Book> findByAdministratorType(); //관리자형
    List<Book> findByExplorerType(); //탐험가형

}