package com.company;

public enum ScrewDrive {
    SLOTDRIVE {
        @Override
        public String toString() {
            return "სლოტი წამყვანი";
        }
    },
    CROSS{
        @Override
        public String toString() {
            return "CROSS";
        }
    },
    HEX{
        @Override
        public String toString() {
            return "HEX";
        }
    },
    TORX{
        @Override
        public String toString() {
            return "TORX";
        }
    }
}
