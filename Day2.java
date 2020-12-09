/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode.pkg2016;

/**
 *
 * @author QDS
 */
public class Day2 {
    public static void main(String args[])
    {
        /*String[] list = {"ULL",
"RRDDD",
"LURDL",
"UUUUD"};*/
        
        String[] list = {"LRRLLLRDRURUDLRDDURULRULLDLRRLRLDULUDDDDLLRRLDUUDULDRURRLDULRRULDLRDUDLRLLLULDUURRRRURURULURRULRURDLULURDRDURDRLRRUUDRULLLLLDRULDDLLRDLURRLDUURDLRLUDLDUDLURLRLDRLUDUULRRRUUULLRDURUDRUDRDRLLDLDDDLDLRRULDUUDULRUDDRLLURDDRLDDUDLLLLULRDDUDDUUULRULUULRLLDULUDLLLLURRLDLUDLDDLDRLRRDRDUDDDLLLLLRRLLRLUDLULLDLDDRRUDDRLRDDURRDULLLURLRDLRRLRDLDURLDDULLLDRRURDULUDUDLLLDDDLLRLDDDLLRRLLURUULULDDDUDULUUURRUUDLDULULDRDDLURURDLDLULDUDUDDDDD",
"RUURUDRDUULRDDLRLLLULLDDUDRDURDLRUULLLLUDUDRRUDUULRRUUDDURDDDLLLLRRUURULULLUDDLRDUDULRURRDRDLDLDUULUULUDDLUDRLULRUDRDDDLRRUUDRRLULUULDULDDLRLURDRLURRRRULDDRLDLLLRULLDURRLUDULDRDUDRLRLULRURDDRLUDLRURDDRDULUDLDLLLDRLRUDLLLLLDUDRDUURUDDUDLDLDUDLLDLRRDLULLURLDDUDDRDUDLDDUULDRLURRDLDLLUUDLDLURRLDRDDLLDLRLULUDRDLLLDRLRLLLDRUULUDLLURDLLUURUDURDDRDRDDUDDRRLLUULRRDRULRURRULLDDDUDULDDRULRLDURLUDULDLDDDLRULLULULUDLDDRDLRDRDLDULRRLRLRLLLLLDDDRDDULRDULRRLDLUDDDDLUDRLLDLURDLRDLDRDRDURRDUDULLLDLUDLDRLRRDDDRRLRLLULDRLRLLLLDUUURDLLULLUDDRLULRDLDLDURRRUURDUDRDLLLLLLDDDURLDULDRLLDUDRULRRDLDUDRLLUUUDULURRUR",
"URRRLRLLDDDRRLDLDLUDRDRDLDUDDDLDRRDRLDULRRDRRDUDRRUUDUUUDLLUURLRDRRURRRRUDRLLLLRRDULRDDRUDLRLUDURRLRLDDRRLUULURLURURUDRULDUUDLULUURRRDDLRDLUDRDLDDDLRUDURRLLRDDRDRLRLLRLRUUDRRLDLUDRURUULDUURDRUULDLLDRDLRDUUDLRLRRLUDRRUULRDDRDLDDULRRRURLRDDRLLLRDRLURDLDRUULDRRRLURURUUUULULRURULRLDDDDLULRLRULDUDDULRUULRRRRRLRLRUDDURLDRRDDULLUULLDLUDDDUURLRRLDULUUDDULDDUULLLRUDLLLRDDDLUUURLDUDRLLLDRRLDDLUDLLDLRRRLDDRUULULUURDDLUR",
"UULDRLUULURDRLDULURLUDULDRRDULULUDLLDURRRURDRLRLLRLDDLURRDLUUDLULRDULDRDLULULULDDLURULLULUDDRRULULULRDULRUURRRUDLRLURDRURDRRUDLDDUURDUUDLULDUDDLUUURURLRRDLULURDURRRURURDUURDRRURRDDULRULRRDRRDRUUUUULRLUUUDUUULLRRDRDULRDDULDRRULRLDLLULUUULUUDRDUUUDLLULDDRRDULUURRDUULLUUDRLLDUDLLLURURLUDDLRURRDRLDDURLDLLUURLDUURULLLRURURLULLLUURUUULLDLRDLUDDRRDDUUDLRURDDDRURUURURRRDLUDRLUULDUDLRUUDRLDRRDLDLDLRUDDDDRRDLDDDLLDLULLRUDDUDDDLDDUURLDUDLRDRURULDULULUDRRDLLRURDULDDRRDLUURUUULULRURDUUDLULLURUDDRLDDUDURRDURRUURLDLLDDUUDLLUURDRULLRRUUURRLLDRRDLURRURDULDDDDRDD",
"LLRUDRUUDUDLRDRDRRLRDRRUDRDURURRLDDDDLRDURDLRRUDRLLRDDUULRULURRRLRULDUURLRURLRLDUDLLDULULDUUURLRURUDDDDRDDLLURDLDRRUDRLDULLRULULLRURRLLURDLLLRRRRDRULRUDUDUDULUURUUURDDLDRDRUUURLDRULDUDULRLRLULLDURRRRURRRDRULULUDLULDDRLRRULLDURUDDUULRUUURDRRLULRRDLDUDURUUUUUURRUUULURDUUDLLUURDLULUDDLUUULLDURLDRRDDLRRRDRLLDRRLUDRLLLDRUULDUDRDDRDRRRLUDUDRRRLDRLRURDLRULRDUUDRRLLRLUUUUURRURLURDRRUURDRRLULUDULRLLURDLLULDDDLRDULLLUDRLURDDLRURLLRDRDULULDDRDDLDDRUUURDUUUDURRLRDUDLRRLRRRDUULDRDUDRLDLRULDL"};
        
        String answer = "";
        int row = 2;
        int column = 0;
        
        for(int i = 0; i < list.length; i++)
        {
            
            char[] array = list[i].toCharArray();
            
            for(int c = 0; c < array.length; c++)
            {
                switch (array[c]) {
                    case 'U':
                        if(inGrid(row - 1, column)){
                            row -= 1;
                        }
                        break;
                    case 'D':
                        if(inGrid(row + 1, column)){
                            row += 1;
                        }
                        break;
                    case 'L':
                        if(inGrid(row, column - 1)){
                            column -= 1;
                        }
                        break;
                    case 'R':
                        if(inGrid(row, column + 1)){
                            column += 1;
                        }
                        break;
                }
            }
            switch(column)
            {
                case 0:
                    answer += "5";
                    break;
                case 1:
                    if(row == 1){
                        answer += "2";
                    }
                    else if(row == 2){
                        answer += "6";
                    }
                    else if(row == 3){
                        answer += "A";
                    }
                    break;
                case 2:
                    if(row == 0){
                        answer += "1";
                    }
                    else if(row == 1){
                        answer += "3";
                    }
                    else if(row == 2){
                        answer += "7";
                    }
                    else if(row == 3){
                        answer += "B";
                    }
                    else if(row == 4){
                        answer += "D";
                    }
                    break;
                case 3:
                    if(row == 1){
                        answer += "4";
                    }
                    else if(row == 2){
                        answer += "8";
                    }
                    else if(row == 3){
                        answer += "C";
                    }
                    break;
                case 4:
                    answer += "9";
                    break;
                
            }
        }
        System.out.println(answer);
    }
    public static boolean inGrid(int r, int c)
    {
        if((c == 0 && r == 1) || (c == 0 && r == 3) || (c == 1 && r == 0) || (c == 1 && r == 4) || (c == 2 && r == -1) || (c == 2 && r == 5) || (c == 3 && r == 0) || (c == 3 && r == 4) || (c == 4 && r == 1) || (c == 4 && r == 3) || (c == -1 && r == 2) || (c == 5 && r == 2))
        {
            return false;
        }
        return true;
    }
}
