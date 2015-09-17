#Using regular expressions to identify phone numbers in a corpus

import re
#read the input file
inputFile = open("input.txt", "r")
text = inputFile.read()
#regular expression: see if there are matches
match = re.findall(r'[+]?[\d]?[\s]?[-]?[.]?[(]?[0-9][0-9][0-9][)]?[\s]?[-]?[.]?[0-9]|[(][0-9][)]?[0-9]',text)
#write to ouput file
telephoneOutput = open("telephoneOutput.txt", "w")

if match:
     telephoneOutput.write(str(len(match)))
     telephoneOutput.write(" match(es) found: ")
     telephoneOutput.write("\n")
     for item in range(len(match)):
         telephoneOutput.write(str(match[item]))
         telephoneOutput.write("\n")
         #insert brackets around money expressions
         newtext = text.replace(str(match[item]), ('['+str(match[item])+']'))
else:
     telephoneOutput.write("No matches found:")
#output
telephoneOutput.close()
