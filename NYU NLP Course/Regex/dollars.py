#Using regular expressions to identify dollar amounts in a corpus

import re
#read the input file
inputFile = open("input.txt", "r")
text = inputFile.read()
#regular expression: see if there are matches
match = re.findall(r'[$][\s]?[\d]*|[0-9]|[\d]*[\s]?/[dD]ollar[s]?|[cC]ent[s]?|[bB]uck[s]?|[dD]dime[s]?|[nN]ickle[s]?|[qQ]uarter[s]/',text)
#write to ouput file
dollarsOutput = open("dollarsOutput.txt", "w")

if match:
     dollarsOutput.write(str(len(match)))
     print(str((match)))
     dollarsOutput.write(" match(es) found: ")
     dollarsOutput.write("\n")
     for item in range(len(match)):
         dollarsOutput.write(str(match[item]))
         dollarsOutput.write("\n")
         print(item, ":", match[item])
         #insert brackets around money expressions
         newtext = text.replace(str(match[item]), ('['+str(match[item])+']'))
         
else:
     dollarsOutput.write("No matches found:")
#Output
print(newtext)
dollarsOutput.close()
