package com.company;

public enum Days {

    MONDAY {
        @Override
        public String method1() {
            return "Дуйшомбу куну Java окуйбуз.";
        }
    },
    TUESDAY {
        @Override
        public String method1() {
            return "Шейшемби куну Java Script окуйбуз.";
        }
    },
    WEDNESDAY {
        @Override
        public String method1() {
            return "Шаршемби куну English окуйбуз.";
        }
    },
    THURSDAY {
        @Override
        public String method1() {
            return "Бейшенби куну Soft Skills окуйбуз.";
        }
    },
    FRIDAY {
        @Override
        public String method1() {
            return "Жума куну C++ окуйбуз.";
        }
    },
    SATURDAY {
        @Override
        public String method1() {
            return "Ишемби куну PHP окуйбуз.";
        }
    },
    SUNDAY {
        @Override
        public String method1() {
            return "Жекшемби куну Phyton окуйбуз.";
        }
    };

    public abstract String method1();

   }
