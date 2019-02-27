package net.unadeca.quiz.database;

import com.raizlabs.android.dbflow.annotation.Database;

@Database(name =Testdatabase.dbname, version = Testdatabase.dbversion)
public class Testdatabase {
    public static final String dbname="TestDatabase";
    public static final int dbversion=1;

}
