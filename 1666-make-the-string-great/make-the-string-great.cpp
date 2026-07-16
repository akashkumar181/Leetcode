

class Solution {
public:
    string makeGood(string s) {
        string result = "";
        
        for (int i = 0; i < s.length(); i++) {
            char current_char = s[i];
            
            if (result.length() > 0) {
                char last_char = result.back();
                
                if (last_char != current_char && tolower(last_char) == tolower(current_char)) {
                    result.pop_back(); 
                    continue;          
                }
            }
            
       
            result.push_back(current_char);
        }
        
        return result;
    }
};
