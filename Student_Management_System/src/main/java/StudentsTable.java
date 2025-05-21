import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentsTable{
    public void addstudent(String firstName, String lastName, String email, String date_of_birth){
        String sql = "INSERT INTO students(first_name, last_name, email, date_of_birth) VALUES(?,?,?,?)";
        try(Connection con = DBConnection.connect();
           PreparedStatement state = con.prepareStatement(sql)){

              state.setString(1, firstName);
              state.setString(2, lastName);
              state.setString(3, email);
              state.setString(4, date_of_birth);
              state.executeUpdate();

            System.out.println("student added successfully");
        }catch(SQLException e){
            e.printStackTrace();
        }
        }

        public List<String> getAllstudents(){
        List<String> students = new ArrayList<>();
            String sql = "SELECT * FROM students";

            try (Connection conn = DBConnection.connect();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    String student = rs.getInt("id") + " - " +
                            rs.getString("first_name") + " " +
                            rs.getString("last_name");
                    students.add(student);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return students;
        }
    public void updateStudent(int studentID,String newFirstName, String newLastName, String newEmail, String newDateOfBirth) {
        String sql = "UPDATE students SET first_name = ?, last_name = ?, email = ?, date_of_birth = ? WHERE id = ?";
        try(Connection conn = DBConnection.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(5, studentID);
            stmt.setString(1, newFirstName);
            stmt.setString(2, newLastName);
            stmt.setString(3, newEmail);
            stmt.setString(4, newDateOfBirth);
            stmt.executeUpdate() ;
            System.out.println("updateStudent: student updated" + "student updated successfully");
        }catch(SQLException e){
            e.printStackTrace();
        }

    }
    public void deleteStudent(int studentID) {
        String sql = "DELETE FROM students WHERE id = ?";
        try(Connection conn = DBConnection.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, studentID);
            stmt.executeUpdate() ;
            System.out.println("deleteStudent: student deleted" + "student deleted successfully");
        }catch(SQLException e){
            e.printStackTrace();
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
    public static void main (String[] args) {
        StudentsTable studentTable = new StudentsTable();
        studentTable.addstudent("gaju","queen","gaju@gmail.com","07/7/2020") ;
        System.out.println( studentTable );
    }
};



