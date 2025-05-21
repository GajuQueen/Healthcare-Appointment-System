import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Courses {
    public void addCourse(String courseName, String description) {
        String sql = "INSERT INTO courses (courseName, description) VALUES (?,?)";
        try(Connection conn = DBConnection.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, courseName);
            stmt.setString(2, description);
            stmt.executeUpdate();
            System.out.println("Course added successfully" + courseName);
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
    public List<String> getAllCourses() {
        List<String> courses = new ArrayList<>();
        String sql = "SELECT * FROM courses";
        try (Connection conn = DBConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                courses.add(rs.getInt("id") + " " +
                        rs.getString("courseName"));
                rs.getString("description");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courses;
    }
    public void updateCourse(int courseID,String newCourseName, String newDescription) {
        String sql = "UPDATE courses SET courseName = ?, description = ? WHERE id = ?";
        try(Connection conn =DBConnection.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, newCourseName);
            stmt.setString(2, newDescription);
            stmt.setInt(3, courseID);
            stmt.executeUpdate();
            System.out.println("Course updated successfully" + courseID);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void deleteCourse(int courseID) {
        String sql = "DELETE FROM courses WHERE id = ?";
        try(Connection conn = DBConnection.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, courseID);
            stmt.executeUpdate();
            System.out.println("Course deleted successfully" + courseID);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
return courses;
}

public static void main(String[] args) {
    Courses courses = new Courses();

    // Add new courses
    courses.addCourse("Java Programming", "Learn Java from beginner to advanced.");
    courses.addCourse("Web Development", "HTML, CSS, JavaScript, and more.");

    // View all courses
    List<String> allCourses = courses.getAllCourses();
    System.out.println("📚 All Courses in Database:");
    for (String c : allCourses) {
        System.out.println(c);
    }
}
}


    //    @Override
//    public void insert(){}
//
//    @Override
//    public void update() {
//
//    }
//
//    @Override
//    public void delete() {
//
//    }
//
//    @Override
//    public void view() {
//
//    }

}

