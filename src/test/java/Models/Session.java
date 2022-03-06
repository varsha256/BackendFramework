package Models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Session   {

        @Getter
        @Setter
        public int center_id;
        public String name;
        public String address;
        public String state_name;
        public String district_name;
        public String block_name;
        public int pincode;
        public String from;
        @JsonProperty("to")
        public String myto;
        public int lat;
        @JsonProperty("long")
        public int mylong;
        public String fee_type;
        public String session_id;
        public String date;
        public int available_capacity;
        public int available_capacity_dose1;
        public int available_capacity_dose2;
        public String fee;
        public int min_age_limit;
        public int max_age_limit;
        public boolean allow_all_age;
        public String vaccine;
        public ArrayList<String> slots;

}
