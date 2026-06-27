package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data811RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data812RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data813RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data814RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data815RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data816RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data817RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data818RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data819RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data820RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen082ViewModel @Inject constructor(
    private val repo1: Data811RepositoryImpl,
    private val repo2: Data812RepositoryImpl,
    private val repo3: Data813RepositoryImpl,
    private val repo4: Data814RepositoryImpl,
    private val repo5: Data815RepositoryImpl,
    private val repo6: Data816RepositoryImpl,
    private val repo7: Data817RepositoryImpl,
    private val repo8: Data818RepositoryImpl,
    private val repo9: Data819RepositoryImpl,
    private val repo10: Data820RepositoryImpl,

): ViewModel() {
}
