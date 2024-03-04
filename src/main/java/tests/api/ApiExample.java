package tests.api;


    public class ApiExample  {


            private String name;
            private String description;

            private String id;
            private String type;


        // In Intellij Idea - Code - Generate - Constructor - choose all fields - OK
        // while getting a response from server we create a constructor, to have this class (with response)


        public ApiExample(String name, String description, boolean hypoallergenic, String id, String type) {

            this.name = name;
            this.description = description;
            this.id = id;
            this.type = type;

        }


        // the same way generate getter to separatly get data we need
        // with the help of getters we can compare expected and actual results


        public String getName() {

            return  name;

        }

        public String getDescription() {

            return  description;

        }


        public String getId() {

            return id;

        }

        public String getType() {

            return type;

        }

    }
