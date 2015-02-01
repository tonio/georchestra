package org.georchestra.lib.sqlcommand;

import java.sql.Connection;

public abstract class AbstractDataCommand implements DataCommand {

	protected Connection connection;

	@Override
	public void setConnection(Connection connection) {
		this.connection = connection;
	}


}
