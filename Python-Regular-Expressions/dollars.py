#Using regular expressions to identify dollar amounts in a corpus
#still needs tweaking
import re
inputFile = open("input.txt", "r")
text = inputFile.read()
match = re.findall(r'[$][\s]?[\d]*|[0-9]|[\d]*[\s]?/[dD]ollar[s]?|[cC]ent[s]?|[bB]uck[s]?|[dD]dime[s]?|[nN]ickle[s]?|[qQ]uarter[s]/',text)
dollarsOutput = open("dollarsOutput.txt", "w")

if match:
     dollarsOutput.write(str(len(match)))
     #print to test -- print(str((match)))
     dollarsOutput.write(" match(es) found: ")
     dollarsOutput.write("\n")
     for item in range(len(match)):
         dollarsOutput.write(str(match[item]))
         dollarsOutput.write("\n")
         #print to test -- print(item, ":", match[item])
         #insert brackets around money expressions
         newtext = text.replace(str(match[item]), ('['+str(match[item])+']'))
         
else:
     dollarsOutput.write("No matches found:")
#print to test -- print(newtext)
dollarsOutput.close()
