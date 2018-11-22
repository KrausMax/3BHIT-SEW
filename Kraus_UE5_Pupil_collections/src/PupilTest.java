import Pupil.*;

public class PupilTest {

    public static void main(String[] args) {
        PupilStorage pupilTest = new PupilStorage();
        pupilTest.createPupils(4);
        pupilTest.deletePupil(3);
        pupilTest.createPupils(2);
        pupilTest.deletePupil(4);
        System.out.println("Der Gesuchte Schüler hat die Schüler-ID: " + pupilTest.searchName("Nachname"));
        pupilTest.printAll();

        //Array aus Liste erstellt
        Pupil[] pupilarray = new Pupil[4];
        pupilarray = pupilTest.getPupilsAsArray(pupilarray);

        for (int i = 0; i < pupilarray.length; i++) {
            System.out.println("Element " + (i + 1) + " hat den Wert: " + pupilarray[i]);
        }
    }
}
