package main.scala.crackingcode.chapter8

object Question8_7 {

    def getPermutations(string : String) : Set[String] = {
        // pre: string contains characters with no duplicates
        
        if (string.length <= 1) {
            // base case:
            // getPermutations("") -> Set("")
            // getPermutations("a") -> Set("a")
            return Set[String](string);
        }
        
        // cases:
        // getPermutations("ab") -> Set( "ab", "ba" );
        // getPermutations("abc") -> Set( "abc", "acb", "bac", "bca", "cab", "cba" ); 
        
        var permutations : Set[String] = Set[String]();
        
        var subPermutations : Set[String] = getPermutations(string.tail);
        for (subPermutation <- subPermutations) {
            // [ b, c, d ]
            //  ^  ^  ^  ^
            for (i <- 0 to subPermutation.length()) {
                var permutation = subPermutation.substring(0, i) +
                                    string.head + subPermutation.substring(i);
                permutations += permutation;
                
            }
        }
        
        return permutations;
        
    }
}