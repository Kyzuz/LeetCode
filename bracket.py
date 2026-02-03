        
def main():
    count = 0
    s = "{(}"    
    s_out = ""

    for char in s:
        count += 1
        openbracket = False

        if char == "(" or char == "{" or char == "[":
            openbracket = True

            if char == "(":
                s_out = s_out + ")"
            elif char == "{":
                s_out = s_out + "}"
            elif char == "[":
                s_out = s_out + "]"
            

        if openbracket:
            s_out = s_out + char

    print(s_out)