import convertor.EnginCCConvertorAdapter;
import iterator.Iterator;
import motoType.Enduro;
import motoType.NakedBike;
import motoType.SportBike;
import repository.MotoRepository;
import repository.MotoShow;
import showTricks.ShowControl;
import showTricks.Stoppie;


public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Main main = new Main();

        main.command();
        main.adapter();
        main.intarator();
        main.composite();
        main.prototype();
    }



        void command () {
            NakedBike nakedBike = new NakedBike();
            Stoppie stoppie = new Stoppie(nakedBike);
            ShowControl showControl = new ShowControl(stoppie);
            showControl.pressButton();
        }

        void prototype() throws CloneNotSupportedException {
            NakedBike nakedBike = new NakedBike();
            NakedBike nakedBike2 = (NakedBike) nakedBike.clone();
            NakedBike nakedBike3 = (NakedBike) nakedBike.clone();
        }

        void adapter(){
            NakedBike nakedBike = new NakedBike();
            EnginCCConvertorAdapter enginCCConvertorAdapter = new EnginCCConvertorAdapter(nakedBike);
            System.out.println(enginCCConvertorAdapter.getHorsepower());
        }

        void intarator(){

            MotoRepository motoRepository = new MotoRepository();

            Iterator iterator = motoRepository.getIterator();

            // itarator.Iterator output.
            while (iterator.hasNext()) {
                System.out.println("motoInterface.Motos = " + iterator.next());
            }
        }
        void composite(){
            // Initialize different motoType.NakedBike objects
            NakedBike nakedBike1 = new NakedBike();
            NakedBike nakedBike2 = new NakedBike();
            NakedBike nakedBike3 = new NakedBike();

            // Initialize different motoType.SportBike objects
            SportBike sportBike = new SportBike();
            SportBike sportBike2 = new SportBike();

            // Initialize different motoType.Enduro objects
            Enduro enduro = new Enduro();

            // Initializes repository.MotoShow objects
            MotoShow motoShow1 = new MotoShow();
            MotoShow motoShow2 = new MotoShow();

            // Add different objects to motoShow1
            motoShow1.addMoto(nakedBike1);
            motoShow1.addMoto(nakedBike2);
            motoShow1.addMoto(sportBike);
            motoShow1.addMoto(enduro);

            // Add different objects to garage2
            motoShow2.addMoto(nakedBike3);
            motoShow2.addMoto(sportBike2);


            //Output result
            System.out.println("All Moto");
            motoShow1.getName();
            System.out.println();

            //Removing one record from composite
            motoShow1.removeFile(nakedBike2);

            //Output result
            System.out.println("All Moto after removing nakedBike2 from motoShow1");
            motoShow1.getName();
        }
    }




