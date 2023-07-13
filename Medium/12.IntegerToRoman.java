class Solution {
    public String intToRoman(int num) {
        Map<Integer, Character> conv  = new HashMap<>() {{
            put(1, 'I');
            put(5, 'V');
            put(10, 'X');
            put(50, 'L');
            put(100, 'C');
            put(500, 'D');
            put(1000, 'M');
        }};
        String rom = "";
        int tmp = 0;
        Character cnv;
        /* String dec = Integer.toString(num); */
        /* System.out.println(dec); */
        int mult = 0;
        int len = (int)Math.log10(num) + 1;
        for(int i = 0; i < len; i++){
            mult = (int)Math.pow(10,i);
            tmp = (num%(mult*10) - num%mult);
            System.out.println(tmp);
            if((cnv = conv.get(tmp)) != null) // case 1* or 5*
                rom = cnv + rom;
            else if(tmp == 0){}
            else if(tmp < 4*mult){ // case 2* 3*
                for(int k = 0; k < tmp/mult; k++)
                    rom = conv.get(mult) + rom;
            }
            else if(tmp > 5*mult && tmp < 9*mult){ // case 6* 7* 8*
                for(int k = 0; k < tmp/mult-5; k++)
                    rom = conv.get(mult) + rom;
                rom = conv.get(5*mult) + rom;
            }
            else{ // case 4* 9*
                if(tmp == 9*mult)
                    rom = conv.get(mult*10) + rom;
                else
                    rom = conv.get(mult*5) + rom;
                rom = conv.get(mult) + rom;
            }
        }
        return rom;
    }
}