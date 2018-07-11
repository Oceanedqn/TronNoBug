package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.CallableStatement;

/**
 * <h1>The Class BoulderDashBDDConnector.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
final class TronBDDConnector {

	/** The instance. */
	private static TronBDDConnector instance = null;

	/** The login. */
	private static String user = "root";

	/** The password. */
	private static String password = "";

	/** The url. */
	private static String url = "jdbc:mysql://localhost/lorann?useSSL=false&serverTimezone=UTC";

	/** The connection. */
	private Connection connection;

	/** The statement. */
	private Statement statement;

	/**
	 * Instantiates a new boulder dash BDD connector.
	 */
	TronBDDConnector() {
		this.open();
	}

	public void message(String message, int time) throws SQLException {
		System.out.println("envoie" + message + "test");
		final String sql = "{CALL Message(?, ?)}";
		System.out.println("test1");
		final CallableStatement INSERT = (CallableStatement) this.getConnection().prepareCall(sql);
		INSERT.setString(1, message);
		INSERT.setInt(2, time);
		INSERT.execute();
		System.out.println("envoie" + message + "test2");

	}

	/**
	 * Sets the instance.
	 *
	 * @param instance
	 *            the new instance
	 */
	@SuppressWarnings("unused")
	private static void setInstance(final TronBDDConnector instance) {
		TronBDDConnector.instance = instance;
	}

	/**
	 * Open.
	 *
	 * @return true, if successful
	 */
	private boolean open() {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			this.connection = DriverManager.getConnection(TronBDDConnector.url, TronBDDConnector.user,
					TronBDDConnector.password);
		} catch (

		final ClassNotFoundException e) {
			e.printStackTrace();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	/**
	 * Execute query.
	 *
	 * @param query
	 *            the query
	 * @return the result set
	 */
	public ResultSet executeQuery(final String query) {
		try {
			return this.getStatement().executeQuery(query);
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Prepare call.
	 *
	 * @param query
	 *            the query
	 * @return the java.sql. callable statement
	 */
	public java.sql.CallableStatement prepareCall(final String query) {
		try {
			return this.getConnection().prepareCall(query);
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Execute update.
	 *
	 * @param query
	 *            the query
	 * @return the int
	 */
	public int executeUpdate(final String query) {
		try {
			return this.statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static synchronized TronBDDConnector getInstance() {
		if (TronBDDConnector.instance == null) {
			TronBDDConnector.instance = new TronBDDConnector();
		}
		return TronBDDConnector.instance;
	}

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 */
	public Connection getConnection() {
		return this.connection;
	}

	/**
	 * Sets the connection.
	 *
	 * @param connection
	 *            the new connection
	 */
	public void setConnection(final Connection connection) {
		this.connection = connection;
	}

	/**
	 * Gets the statement.
	 *
	 * @return the statement
	 */
	public Statement getStatement() {
		return this.statement;
	}

	/**
	 * Sets the statement.
	 *
	 * @param statement
	 *            the new statement
	 */
	public void setStatement(final Statement statement) {
		this.statement = statement;
	}

	public TronBDDConnector sauverEnBase(String player, int time) {
		String url = "jdbc:mysql://localhost/lorann?useSSL=false&serverTimezone=UTC";
		String login = "root";
		String passvd = "";
		Connection cn = null;
		Statement st = null;

		try {

			cn = DriverManager.getConnection(url, login, passvd);
			st = cn.createStatement();
			String sql = "INSERT INTO `lorann` (`player_win`), (`player_time`) VALUES (`" + player + time + "`)";

			st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return instance;
	}

}
