package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data041RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data042RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data043RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data044RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data045RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data046RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data047RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data048RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data049RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data050RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen005ViewModel @Inject constructor(
    private val repo1: Data041RepositoryImpl,
    private val repo2: Data042RepositoryImpl,
    private val repo3: Data043RepositoryImpl,
    private val repo4: Data044RepositoryImpl,
    private val repo5: Data045RepositoryImpl,
    private val repo6: Data046RepositoryImpl,
    private val repo7: Data047RepositoryImpl,
    private val repo8: Data048RepositoryImpl,
    private val repo9: Data049RepositoryImpl,
    private val repo10: Data050RepositoryImpl,

): ViewModel() {
}
