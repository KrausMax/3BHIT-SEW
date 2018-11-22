package Pupil;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PupilStorage {

    private List<Pupil> pupilList = new ArrayList<Pupil>();     //Liste die Array oder LinkedList sein kann.

    public PupilStorage() {
    }

    public void createPupils(int x) {

        for (int i = 0; i < x; i++) {
            if (pupilList.isEmpty() == true) {
                pupilList.add(i, new Pupil("Nachname", "Vorname", "Klasse", 0, 1));
            } else {
                pupilList.add(pupilList.indexOf(pupilList.get(pupilList.size() - 1)) + 1, new Pupil("Nachname", "Vorname", "Klasse", 0, pupilList.get(pupilList.size() - 1).getSchuelerID() + 1));
            }

        }
    }

    public void deletePupil(int id) {
        Iterator<Pupil> deleteIterator = pupilList.iterator();

        while (deleteIterator.hasNext()) {

            Pupil currPupil = deleteIterator.next();
            if (currPupil.getSchuelerID() == id) {
                pupilList.remove(currPupil);

                return;
            }
        }
    }

    public int searchName(String name) {

        Iterator<Pupil> pupilIterator = pupilList.iterator();

        while (pupilIterator.hasNext()) {

            Pupil currPupil = pupilIterator.next();

            if (currPupil.getnName().equals(name)) {
                return currPupil.getSchuelerID();
            }
        }
        return 0;
    }

    public void printAll() {
        for (Pupil pupil : pupilList) {
            System.out.println(pupil);
        }
    }

    public Pupil[] getPupilsAsArray(Pupil[] arrobj) {
        arrobj = pupilList.toArray(arrobj);
        return arrobj;
    }
}