package isp.lab7.safehome;

public class SafeHome {

    public static void main(String[] args) {

        DoorLockController d = new DoorLockController();
        try {
            d.addTenant("1234", "Andreea");
            d.addTenant("012345", "Andreea");
        } catch (TenantAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < 2; i++) {
            try {

                d.enterPin("678");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {

            d.enterPin("678");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < 2; i++) {
            try {

                d.enterPin("678");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i = 0; i < 2; i++) {
            try {

                d.enterPin("678");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            d.addTenant("7456", "Andra");
        } catch (TenantAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            d.enterPin("1457");

        } catch (TooManyAttemptsException | InvalidPinException e) {
            System.out.println(e.getMessage());
        }
        try {

            d.enterPin("789");

        } catch (TooManyAttemptsException | InvalidPinException e) {
            System.out.println(e.getMessage());
        }

        try {

            d.enterPin("4234");

        } catch (TooManyAttemptsException | InvalidPinException e) {
            System.out.println(e.getMessage());
        }
        try {

            d.enterPin("4444");
        } catch (TooManyAttemptsException | InvalidPinException e) {
            System.out.println(e.getMessage());
        }
    }
}
