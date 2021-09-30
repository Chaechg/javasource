
public class DaoEx {
	public static void main(String[] args) {
		dbwork(new OracleDao());
		dbwork(new MySqlDao());

	}
	
	public static void dbwork (DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
}
