package com.mokelab.demo.multimodule

import androidx.compose.runtime.Composable
import com.mokelab.demo.multimodule.feature.feature1.Screen001
import com.mokelab.demo.multimodule.feature.feature1.Screen002
import com.mokelab.demo.multimodule.feature.feature1.Screen003
import com.mokelab.demo.multimodule.feature.feature1.Screen004
import com.mokelab.demo.multimodule.feature.feature1.Screen005
import com.mokelab.demo.multimodule.feature.feature1.Screen006
import com.mokelab.demo.multimodule.feature.feature1.Screen007
import com.mokelab.demo.multimodule.feature.feature1.Screen008
import com.mokelab.demo.multimodule.feature.feature1.Screen009
import com.mokelab.demo.multimodule.feature.feature1.Screen010
import com.mokelab.demo.multimodule.feature.feature10.Screen091
import com.mokelab.demo.multimodule.feature.feature10.Screen092
import com.mokelab.demo.multimodule.feature.feature10.Screen093
import com.mokelab.demo.multimodule.feature.feature10.Screen094
import com.mokelab.demo.multimodule.feature.feature10.Screen095
import com.mokelab.demo.multimodule.feature.feature10.Screen096
import com.mokelab.demo.multimodule.feature.feature10.Screen097
import com.mokelab.demo.multimodule.feature.feature10.Screen098
import com.mokelab.demo.multimodule.feature.feature10.Screen099
import com.mokelab.demo.multimodule.feature.feature2.Screen011
import com.mokelab.demo.multimodule.feature.feature2.Screen012
import com.mokelab.demo.multimodule.feature.feature2.Screen013
import com.mokelab.demo.multimodule.feature.feature2.Screen014
import com.mokelab.demo.multimodule.feature.feature2.Screen015
import com.mokelab.demo.multimodule.feature.feature2.Screen016
import com.mokelab.demo.multimodule.feature.feature2.Screen017
import com.mokelab.demo.multimodule.feature.feature2.Screen018
import com.mokelab.demo.multimodule.feature.feature2.Screen019
import com.mokelab.demo.multimodule.feature.feature2.Screen020
import com.mokelab.demo.multimodule.feature.feature3.Screen021
import com.mokelab.demo.multimodule.feature.feature3.Screen022
import com.mokelab.demo.multimodule.feature.feature3.Screen023
import com.mokelab.demo.multimodule.feature.feature3.Screen024
import com.mokelab.demo.multimodule.feature.feature3.Screen025
import com.mokelab.demo.multimodule.feature.feature3.Screen026
import com.mokelab.demo.multimodule.feature.feature3.Screen027
import com.mokelab.demo.multimodule.feature.feature3.Screen028
import com.mokelab.demo.multimodule.feature.feature3.Screen029
import com.mokelab.demo.multimodule.feature.feature3.Screen030
import com.mokelab.demo.multimodule.feature.feature4.Screen031
import com.mokelab.demo.multimodule.feature.feature4.Screen032
import com.mokelab.demo.multimodule.feature.feature4.Screen033
import com.mokelab.demo.multimodule.feature.feature4.Screen034
import com.mokelab.demo.multimodule.feature.feature4.Screen035
import com.mokelab.demo.multimodule.feature.feature4.Screen036
import com.mokelab.demo.multimodule.feature.feature4.Screen037
import com.mokelab.demo.multimodule.feature.feature4.Screen038
import com.mokelab.demo.multimodule.feature.feature4.Screen039
import com.mokelab.demo.multimodule.feature.feature4.Screen040
import com.mokelab.demo.multimodule.feature.feature5.Screen041
import com.mokelab.demo.multimodule.feature.feature5.Screen042
import com.mokelab.demo.multimodule.feature.feature5.Screen043
import com.mokelab.demo.multimodule.feature.feature5.Screen044
import com.mokelab.demo.multimodule.feature.feature5.Screen045
import com.mokelab.demo.multimodule.feature.feature5.Screen046
import com.mokelab.demo.multimodule.feature.feature5.Screen047
import com.mokelab.demo.multimodule.feature.feature5.Screen048
import com.mokelab.demo.multimodule.feature.feature5.Screen049
import com.mokelab.demo.multimodule.feature.feature5.Screen050
import com.mokelab.demo.multimodule.feature.feature6.Screen051
import com.mokelab.demo.multimodule.feature.feature6.Screen052
import com.mokelab.demo.multimodule.feature.feature6.Screen053
import com.mokelab.demo.multimodule.feature.feature6.Screen054
import com.mokelab.demo.multimodule.feature.feature6.Screen055
import com.mokelab.demo.multimodule.feature.feature6.Screen056
import com.mokelab.demo.multimodule.feature.feature6.Screen057
import com.mokelab.demo.multimodule.feature.feature6.Screen058
import com.mokelab.demo.multimodule.feature.feature6.Screen059
import com.mokelab.demo.multimodule.feature.feature6.Screen060
import com.mokelab.demo.multimodule.feature.feature7.Screen061
import com.mokelab.demo.multimodule.feature.feature7.Screen062
import com.mokelab.demo.multimodule.feature.feature7.Screen063
import com.mokelab.demo.multimodule.feature.feature7.Screen064
import com.mokelab.demo.multimodule.feature.feature7.Screen065
import com.mokelab.demo.multimodule.feature.feature7.Screen066
import com.mokelab.demo.multimodule.feature.feature7.Screen067
import com.mokelab.demo.multimodule.feature.feature7.Screen068
import com.mokelab.demo.multimodule.feature.feature7.Screen069
import com.mokelab.demo.multimodule.feature.feature7.Screen070
import com.mokelab.demo.multimodule.feature.feature8.Screen071
import com.mokelab.demo.multimodule.feature.feature8.Screen072
import com.mokelab.demo.multimodule.feature.feature8.Screen073
import com.mokelab.demo.multimodule.feature.feature8.Screen074
import com.mokelab.demo.multimodule.feature.feature8.Screen075
import com.mokelab.demo.multimodule.feature.feature8.Screen076
import com.mokelab.demo.multimodule.feature.feature8.Screen077
import com.mokelab.demo.multimodule.feature.feature8.Screen078
import com.mokelab.demo.multimodule.feature.feature8.Screen079
import com.mokelab.demo.multimodule.feature.feature8.Screen080
import com.mokelab.demo.multimodule.feature.feature9.Screen081
import com.mokelab.demo.multimodule.feature.feature9.Screen082
import com.mokelab.demo.multimodule.feature.feature9.Screen083
import com.mokelab.demo.multimodule.feature.feature9.Screen084
import com.mokelab.demo.multimodule.feature.feature9.Screen085
import com.mokelab.demo.multimodule.feature.feature9.Screen086
import com.mokelab.demo.multimodule.feature.feature9.Screen087
import com.mokelab.demo.multimodule.feature.feature9.Screen088
import com.mokelab.demo.multimodule.feature.feature9.Screen089
import com.mokelab.demo.multimodule.feature.feature9.Screen090

@Composable
fun MainScreen() {
    Screen001()
    Screen002()
    Screen003()
    Screen004()
    Screen005()
    Screen006()
    Screen007()
    Screen008()
    Screen009()
    Screen010()
    Screen011()
    Screen012()
    Screen013()
    Screen014()
    Screen015()
    Screen016()
    Screen017()
    Screen018()
    Screen019()
    Screen020()
    Screen021()
    Screen022()
    Screen023()
    Screen024()
    Screen025()
    Screen026()
    Screen027()
    Screen028()
    Screen029()
    Screen030()
    Screen031()
    Screen032()
    Screen033()
    Screen034()
    Screen035()
    Screen036()
    Screen037()
    Screen038()
    Screen039()
    Screen040()
    Screen041()
    Screen042()
    Screen043()
    Screen044()
    Screen045()
    Screen046()
    Screen047()
    Screen048()
    Screen049()
    Screen050()
    Screen051()
    Screen052()
    Screen053()
    Screen054()
    Screen055()
    Screen056()
    Screen057()
    Screen058()
    Screen059()
    Screen060()
    Screen061()
    Screen062()
    Screen063()
    Screen064()
    Screen065()
    Screen066()
    Screen067()
    Screen068()
    Screen069()
    Screen070()
    Screen071()
    Screen072()
    Screen073()
    Screen074()
    Screen075()
    Screen076()
    Screen077()
    Screen078()
    Screen079()
    Screen080()
    Screen080()
    Screen080()
    Screen081()
    Screen082()
    Screen083()
    Screen084()
    Screen085()
    Screen086()
    Screen087()
    Screen088()
    Screen089()
    Screen090()
    Screen091()
    Screen092()
    Screen093()
    Screen094()
    Screen095()
    Screen096()
    Screen097()
    Screen098()
    Screen099()
}