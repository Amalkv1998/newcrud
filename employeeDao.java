package emppack;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


public class employeeDao {
	JdbcTemplate template;

	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int save(employee e)
	{
		String sql="insert into employee002 values(null,'"+e.getFname()+"','"+e.getLname()+"','"+e.getAddress()+"','"+e.getState()+"','"+e.getCountry()+"','"+e.getDepartment()+"','"+e.getZipcode()+"')";
		return template.update(sql);
	}
    
	public int delemp(int id)
	{
		String sql="delete from employee002 where id='"+id+"'";
		return template.update(sql);
	}
    
	public int editemp(employee e)
	{
		String sql="update employee002 set Fname='"+e.getFname()+"',Lname='"+e.getLname()+"',address='"+e.getAddress()+"',state='"+e.getState()+"',country='"+e.getCountry()+"',department='"+e.getDepartment()+"',zipcode='"+e.getZipcode()+"' where id='"+e.getId()+"'";
		return template.update(sql);
	}
	
	public List<employee>getemp()
	{
		return template.query("select * from employee002", new RowMapper<employee>()
				{

					@Override
					public employee mapRow(ResultSet rs, int row) throws SQLException {
						// TODO Auto-generated method stub
						employee e=new employee();
						e.setId(rs.getInt(1));
						e.setFname(rs.getString(2));
						e.setLname(rs.getString(3));
						e.setAddress(rs.getString(4));
						e.setState(rs.getString(5));
						e.setCountry(rs.getString(6));
						e.setDepartment(rs.getString(7));
						e.setZipcode(rs.getInt(8));
						System.out.println(rs.getString(2));
						return e;
					}
			
				});
		
				
	}
	
	public List<employee>getempbyid(int id)
	{
		return template.query("select * from employee002 where id='"+id+"'", new RowMapper<employee>()
				{

					@Override
					public employee mapRow(ResultSet rs, int row) throws SQLException {
						// TODO Auto-generated method stub
						employee e=new employee();
						e.setId(rs.getInt(1));
						e.setFname(rs.getString(2));
						e.setLname(rs.getString(3));
						e.setAddress(rs.getString(4));
						e.setState(rs.getString(5));
						e.setCountry(rs.getString(6));
						e.setDepartment(rs.getString(7));
						e.setZipcode(rs.getInt(8));
						return e;
					}
			
				});
		
				
	}
}
     