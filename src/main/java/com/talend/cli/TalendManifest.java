package com.talend.cli;

import java.util.Hashtable;

public class TalendManifest {
    private Hashtable<String, String> tables;

    public Hashtable<String, String> getTables() {
        return tables;
    }

    public void setTables(Hashtable<String, String> tables) {
        this.tables = tables;
    }
}
