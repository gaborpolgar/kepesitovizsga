package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JurassicPark {

    private DataSource datasource;

    public JurassicPark(DataSource datasource) {
        this.datasource = datasource;
    }

    public List<String> checkOverpopulation() {
        try (Connection conn = datasource.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("select breed from dinosaur where expected < actual order by breed")) {
            return selectByStatement(rs);
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Cannot check overpopulation.", sqle);
        }

    }

    private List<String> selectByStatement(ResultSet rs) throws SQLException {
        List<String> overpopulatedDinoNames = new ArrayList<>();
        while (rs.next()) {
            String name = rs.getString("breed");
            overpopulatedDinoNames.add(name);
        }
        return overpopulatedDinoNames;
    }
}
