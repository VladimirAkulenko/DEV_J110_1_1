/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dev_j110_1_p1;

/**
 *
 * @author USER
 */
public class DEV_J110_1_P1 {

    public static void main(String[] args) {
        
        Countries [] country = new Countries[7];
        country[0]= new Countries ("Russia",17_100_000,146_700_000,"Moscow",12_600_000);
        country[1]= new Countries ("Finland",338_000, 5_500_000, "Helsinki", 655_000);
        country[2]= new Countries ("France", 643_800, 67_800_000, "Paris", 2_100_000);
        country[3]= new Countries ("Andorra", 467, 85_400, "Andorra la Vella", 22_600);
        country[4]= new Countries ("Singapore", 725, 5_700_000);

        country[5]= new Countries("Государство",300_000, "Столица");
        country[6]= new Countries("Нет Государства и Столицы", 100_000);



        Countries.printAll(country);
                System.out.println();

                for (Countries someCountry:country) {
                        System.out.printf("Плотность %s равна %.2f  жителе на кв. км.\n",someCountry.getName(),someCountry.getDensity());
                }

    }
}
