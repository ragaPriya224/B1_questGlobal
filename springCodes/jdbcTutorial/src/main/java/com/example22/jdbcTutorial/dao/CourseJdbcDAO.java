package com.example22.jdbcTutorial.dao;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.example22.jdbcTutorial.model.Course;

@Component
public class CourseJdbcDAO implements DAO<Course> {

    private static final Logger log = LoggerFactory.getLogger(CourseJdbcDAO.class);
//    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//    public CourseJdbcDAO(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
    public CourseJdbcDAO(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }
    /**
     * Maps a row in the database to a Course
     */
    RowMapper<Course> rowMapper = (rs, rowNum) -> {
        Course course = new Course();
        course.setCourseId(rs.getInt("course_id"));
        course.setTitle(rs.getString("title"));
        course.setDescription(rs.getString("description"));
        course.setLink(rs.getString("link"));
        return course;
    };
//getall the records
//    @Override
//    public List<Course> list() {
//        String sql = "SELECT course_id, title, description, link from course";
//        return jdbcTemplate.query(sql,rowMapper);
//    }
//
//    // CRUD (Create, Read, Update, Delete)
//
//    
//    //create operation
//    @Override
//    public void create(Course course) {
//        String sql = "insert into course(title,description,link) values(?,?,?)";
//        int insert = jdbcTemplate.update(sql,course.getTitle(),course.getDescription(),course.getLink());
//        if(insert == 1) {
//            log.info("New Course Created: " + course.getTitle());
//        }
//    }
////get
//    @Override
//    public Optional<Course> get(int id) {
//        String sql = "SELECT course_id,title,description,link from course where course_id = ?";
//        Course course = null;
//        try {
//            course = jdbcTemplate.queryForObject(sql, new Object[]{id}, rowMapper);
//        }catch (DataAccessException ex) {
//            log.info("Course not found: " + id);
//        }
//        return Optional.ofNullable(course);
//    }
//
//    @Override
//    public void update(Course course, int id) {
//        String sql = "update course set title = ?, description = ?, link = ? where course_id = ?";
//        int update = jdbcTemplate.update(sql,course.getTitle(),course.getDescription(),course.getLink(),id);
//        if(update == 1) {
//            log.info("Course Updated: " + course.getTitle());
//        }
//    }
//
//    @Override
//    public void delete(int id) {
//        String sql = "delete from course where course_id = ?";
//        int delete = jdbcTemplate.update(sql,id);
//        if(delete == 1) {
//            log.info("Course Deleted: " + id);
//        }
//    }
    
//    Queries With Named Parameters
    @Override
    public String  getByTitleTemplate() {
        Course course = null;
    	 SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("id", 1);
    	 return namedParameterJdbcTemplate.queryForObject(
    	      "SELECT title FROM course WHERE course_id = :id", namedParameters, String.class);

    }
//    using the MapSqlParameterSource to provide the values for the named parameters.
    @Override
    public Integer getByTitleMap() {
    	Course employee = new Course();
    employee.setTitle("Angular 4 Java Developers");

    String SELECT_BY_ID = "SELECT COUNT(*) FROM course WHERE title = :title";

    SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(employee);
    return namedParameterJdbcTemplate.queryForObject(
      SELECT_BY_ID, namedParameters, Integer.class);
   
    }
}
