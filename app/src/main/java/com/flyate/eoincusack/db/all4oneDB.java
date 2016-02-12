package com.flyate.eoincusack.db;

import android.provider.BaseColumns;

public final class all4oneDB {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public all4oneDB() {}

    /* Inner class that defines the table contents */
    public static abstract class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "customerDetails";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_FIRSTNAME = "firstName";
        public static final String COLUMN_NAME_LASTNAME = "lastName";
        public static final String COLUMN_NAME_EMAIL = "email";
        public static final String COLUMN_NAME_PHONE = "phone";
        public static final String COLUMN_NAME_PASSWORD = "password";
    }
}