package convertor;

import motoInterface.Moto;

public class EnginCCConvertorAdapter implements EnginCCConvertor {

    /**
     * EnginCC convertor, which is wrapped and being adapted.
     */
    Moto moto;

    /**
     * Constructor with parameter of carInterface.Car object
     * @param moto Horse Power convertor.
     */
    public EnginCCConvertorAdapter(Moto moto) {
        this.moto = moto;
    }


    @Override
    public String getHorsepower() {
        double CC = Double.parseDouble(moto.getEngineSizes());
        return String.valueOf(CC/15);
    }
}

